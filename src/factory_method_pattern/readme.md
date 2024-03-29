# Factory Method Pattern

실행 되어야할 로직과 생성로직을 분리하는 것에 의미가 있다. <br />
아래와 같은 경우에 사용하면 효과를 볼 수 있다. <br />

- if/else를 사용해서 유형별로 로직을 대응하는 경우
- 복잡한 생성로직을 가진 경우

<br />

구체적으로 다음과 같은 이점을 가질 수 있다.
- Single Responsibility Principle: 하나의 클래스가 하나의 책임만 같는다. 생성 담당 클래스는 생성만, 실행 담당 클래스는 실행로직만 담당한다.
- Open/Closed Principle: 새로운 유형이 추가되어도 기존 코드를 수정할 필요가 없다. 이로써 확장에는 열려있고, 변경에는 닫혀있다.

<br />


---


## Scenario1 - 알림서비스

os 별로 다른 로직으로 알림을 보내야하는 상황을 가정해보자

<br />

### step1 - 간단한 케이스

if/else를 사용해서 유형을 구분하고 있다.<br />
notification 클래스 한 곳에서 메세지 보내기와 인증을 모두 하고 있다.<br />
(step1_simple 패키지에서 확인이 가능하다.)

<br />

### step2 - 인터페이스 의존한 형태

인증 클래스를 알림 클래스에 주입하지 않고 분리해서 알림 클래스에서는 알림 로직만 구현하도록 개선<br />
if/else 혹은 메소드 별로 유형의 정보를 구분하고 있던 로직을 interface를 구현하고 유형별로 클래스를 생성<br />
이전 코드에 비해서 Open/Closed Principle의 이점을 가져갈 수 있다.<br />

하지만 아직 Notification을 생성할 때 마다 수반되는 로직을 모두 확인하고 구현해줘야하는 번거로움이 있다<br />
(step2_better 패키지에서 확인이 가능하다.)

<br />


### step3 - 팩토리 메소드 패턴 적용

생성을 담당하는 Factory 클래스를 생성해서 기존에 인증 > 생성 하는 로직을 캡슐화 함 <br />
생성과 실행로직을 분리해서 Single Responsibility Principle 달성 <br />
sender 인스턴스가 필요할 때 내부로직을 몰라도 편하게 생성할 수 있는 장점 <br />
(step2_pattern 패키지에서 확인이 가능하다.)

<br />

### QnA

Q1. 왜 Sender는 interface를 사용하고 Factory는 추상클래스를 사용하는가? <br />
A1. 둘 중 무엇을 사용해도 괜찮다. 공통된 로직을 구현할 필요가 있다면 추상클래스를 사용하는 것이 도움


<br />
<br />


