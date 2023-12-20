// import java.util.Random;
// class CalcQuiz {      //計算問題を１個だけ作るクラス
//   String question;      //問題を保存するフィールド
//   String answer;        //答えを保存するフィールド

//   CalcQuiz () {
//     createQuestion();       //コンストラクタ
//   }
//   void createQuestion() {
//     Random rnd = new Random();
//     int a = rnd.nextInt(100);
//     int b = rnd.nextInt(100);
//     question = a + "x" + b + "=?";     //問題の文字列を作る
//     answer = Integer.toString(a * b);    //答えの文字列を作る
//   }      //ランダムに問題を１つ作る

//   String getQuestion() {
//     return question;      //問題を出してくれるメソッド
//   }
//   String getAnswer() {
//     return answer;       //答えを教えてくれるメソッド
//   }
// }


import java.util.Random;
class CalcQuiz {      //計算問題を１個だけ作るクラス
  String question;      //問題を保存するフィールド
  String answer;        //答えを保存するフィールド

  CalcQuiz () {
    createQuestion();       //コンストラクタ
  }
  void createQuestion() {
    Random rnd = new Random();
    int a = rnd.nextInt(100);
    int b = rnd.nextInt(100);
    this.question = a + "x" + b + "=?";     //問題の文字列を作る
    this.answer = Integer.toString(a * b);    //答えの文字列を作る
  }      //ランダムに問題を１つ作る

  String getQuestion() {
    return this.question;      //問題を出してくれるメソッド
  }
  String getAnswer() {
    return this.answer;       //答えを教えてくれるメソッド
  }
}
