
클래스를 만든다는 것은 사용자가 int, String 처럼 데이터타입을 정의할 수 있는 것이다.

### 발전 방향
1. 필요한 어떤 사물/사람이나 개념을 코드에 그때마다 정의하고서 쓰는 것
2. [배열도입] 배열 자료구조를 사용해서, 좀 더 편하게 개념을 정의한다.
3. [클래스 + 배열] 클래스로 객체 데이터 타입을 정의해서 개념에 대한 인스턴트를 쉽게 여러개 만들 수 있게 한다.
    향상된 for문 함께 사용
    ```java
   for (Student s : students) {
       print(s.name);
   }
   
   for(클래스명 변수 : 객체배열명) {
   }
    ```

##  클래스 , 객체, 인스턴스
- 클래스는 객체를 생성하기 위한 틀,설계도이다.
- 객체와 인스턴스는 클래스로부터 나온 메모리에 얹어진 개념은 같지만, 클래스와의 관계를 강조할 땐 인스턴스를 쓰는 편이다. 

### 멤버변수,지역변수
- 멤버변수는 클래스의 필드를 말한다.
- 지역변수는 함수 안이나 특정 범위 내에서 사용되는 변수이다.
- 두 변수는 초기화 부분에서 다르다.
  - 인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화 한다.
    - int는 0, boolean은 False 등..
    - 클래스 내에 다른 참조형 객체가 필드로 있어도 null로 초기화됨
  - 지역변수는 항상 직접 초기화 해주어야한다. 

