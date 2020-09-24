package chapter13;

public class Anonymous {
	// 필드 초기값으로 대입
	Person field = new Person() { // wake를 재정의함.

		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work(); // 외부 호출이 안되지 내부 호출은 됨.
		}
	};

	void method1() {
		// 로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};

		// 로컬 변수 사용
		localVar.wake();

	}

	void method2(Person person) {
		person.wake();
	}

}
