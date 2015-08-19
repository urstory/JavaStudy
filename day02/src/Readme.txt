데이터Type : 기본형 , 레퍼런스형(모두가 class)
double d1 = 50.5; // 8byte크기의 공간에 50.5 가 저장. 그 공간의 이름이 d1

String s1 = new String("hello"); // "hello"라는 값을 가지는 String인스턴스를
                                 // 레퍼런스하는 s1이라는 변수를 선언

Book b1 = new Book(); // Book인스턴스를 레퍼런스하는 b1이라는 변수를 선언
b1.title = "hello"; // b1이 레퍼런스하는 인스턴스의 title필드에 "hello"를 설정.

Book b2;  // b2는 아직 아무것도 레퍼런스하지 않는다. null을 가진다.
b2.title = "hello"; // 오류!!!!!!!!!!!!!!!!!!!!

int[] array = new int[5]; // 정수배열을 레퍼런스하는 array라는 변수를 선언
                          // 0번째부터 4번째 방은 모두 0을 가지고 있다.
array[0] = 5; // array의 0번째에 5를 설정.

Book[] array2 = new Book[5]; // Book배열을 레퍼런스하는 array2라는 변수를 선언
                            // 0번째부터 4번째 방은 모두 null
array2[0] = new Book();
array2[0].title = "hello";
