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


// public class Main {
//   public static void main(String[] args) {
//     int quizNum = 5;
//     CalcQuiz [] quiz = new CalcQuiz[quizNum];

//     for (int i = 0; i < quizNum; i++) {
//       quiz[i] = new MistakeQuiz();
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

import java.util.Random;
public class Main {
  public static void main(String[] args) {
    Random rnd = new Random();
    int quizNum = 5;       //問題数
    CalcQuiz [] quiz = new CalcQuiz[quizNum];      //問題を作るインスタンスを入れる配列

    for (int i = 0; i < quizNum; i++) {
      int qID = rnd.nextInt(3);       //ランダムに１つ選ぶ
      if (qID == 0) {
        quiz[i] = new MushikuiQuiz();      //虫食いクイズ
      } else if (qID == 1) {
        quiz[i] = new MistakeQuiz();      //間違い探しクイズ
      } else {
        quiz[i] = new TanukiQuiz();       //たぬきの言葉クイズ
      }
    }
    for (int i = 0; i < quizNum; i++) {        //全ての問題を表示する
      System.out.println("問" + i + ":" + quiz[i].getQuestion());
    }
    System.out.println("------------");
    for (int i = 0; i < quizNum; i++) {        //全ての答えを表示する
      System.out.println("答" + i + ":" + quiz[i].getAnswer());
    }
  }
}