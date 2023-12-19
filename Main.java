// public class Main {
//   public static void main(String[] args) {
//     MyClass iroha = new MyClass();

//     iroha.setMyName("いろは");     //最初は命名できる

//     iroha.setMyName("タヌキチ");          //あとから命名しても変わらない

//     iroha.hello();
//   }
// }

public class Main {
  public static void main(String[] args) {
    MyClass iroha = new MyClass();

    iroha.setMyName("いろは");     //最初は命名できる

    iroha.renameMyName("タヌキチ");          //あとから改名できる

    iroha.hello();
  }
}

