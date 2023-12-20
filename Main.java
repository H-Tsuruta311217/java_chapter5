// public class Main {
//   public static void main(String[] args) {
//     MyClass iroha = new MyClass();

//     iroha.setMyName("いろは");     //最初は命名できる

//     iroha.setMyName("タヌキチ");          //あとから命名しても変わらない

//     iroha.hello();
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     MyClass iroha = new MyClass();

//     iroha.setMyName("いろは");     //最初は命名できる

//     iroha.renameMyName("タヌキチ");          //あとから改名できる

//     iroha.hello();
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int quizNum = 5;
//     CalcQuiz [] quiz = new CalcQuiz[quizNum];

//     for (int i = 0; i < quizNum; i++) {
//       quiz[i] = new MushikuiQuiz();
//     }
//     for (int i = 0; i < quizNum; i++) {
//       System.out.println("問" + i + ":" + quiz[i].getQuestion());
//     }
//     System.out.println("------------");
//     for (int i = 0; i < quizNum; i++) {
//       System.out.println("答" + i + ":" + quiz[i].getAnswer());
//     }
//   }
// }


public class Main {
  public static void main(String[] args) {
    int quizNum = 5;
    CalcQuiz [] quiz = new CalcQuiz[quizNum];

    for (int i = 0; i < quizNum; i++) {
      quiz[i] = new MistakeQuiz();
    }
    for (int i = 0; i < quizNum; i++) {
      System.out.println("問" + i + ":" + quiz[i].getQuestion());
    }
    System.out.println("------------");
    for (int i = 0; i < quizNum; i++) {
      System.out.println("答" + i + ":" + quiz[i].getAnswer());
    }
  }
}