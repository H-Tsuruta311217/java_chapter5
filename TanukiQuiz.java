// import java.util.Random;
// class TanukiQuiz extends CalcQuiz{      //たぬきの言葉クイズを作るクラスタ
//   TanukiQuiz () {         //コンストラクタ
//     createQuestion();
//   }
//   void createQuestion() {         //問題を１つ作る
//     String [] answerWord = {"おはよう","おやすみ","おいしい","おかしい"};        //問題にする文字
//     Random rnd = new Random();
//     int qID = rnd.nextInt(answerWord.length);        //何番目を問題にするか
//     this.question = answerWord[qID];

//     for (int i = 0; i < 3; i++) {
//       int cPos = rnd.nextInt(question.length());         //切る位置

//       String firstHalf = this.question.substring(0,cPos);       //前半分
//       String secondHalf = this.question.substring(cPos);        //後ろ半分
//       this.question = firstHalf + "た" + secondHalf;           //たを入れる
//     }
//     this.question += ":このたぬきの言葉を読んで。";            //問題の文字列
//     this.answer = "たを抜くと、" + answerWord[qID];            //答えの文字列
//   }
// }


// import java.util.Random;
// class TanukiQuiz extends Quiz{      //たぬきの言葉クイズを作るクラスタ
//   TanukiQuiz () {         //コンストラクタ
//     createQuestion();
//   }
//   void createQuestion() {         //問題を１つ作る
//     String [] answerWord = {"おはよう","おやすみ","おいしい","おかしい"};        //問題にする文字
//     Random rnd = new Random();
//     int qID = rnd.nextInt(answerWord.length);        //何番目を問題にするか
//     this.question = answerWord[qID];

//     for (int i = 0; i < 3; i++) {
//       int cPos = rnd.nextInt(question.length());         //切る位置

//       String firstHalf = this.question.substring(0,cPos);       //前半分
//       String secondHalf = this.question.substring(cPos);        //後ろ半分
//       this.question = firstHalf + "た" + secondHalf;           //たを入れる
//     }
//     this.question += ":このたぬきの言葉を読んで。";            //問題の文字列
//     this.answer = "たを抜くと、" + answerWord[qID];            //答えの文字列
//   }
// }


import java.util.Random;
class TanukiQuiz extends Quiz{      //たぬきの言葉クイズを作るクラスタ
  TanukiQuiz () {         //コンストラクタ
    createQuestion();
  }
  void createQuestion() {         //問題を１つ作る
    String [] answerWord = {"おはよう","おやすみ","おいしい","おかしい"};        //問題にする文字
    Random rnd = new Random();
    int qID = rnd.nextInt(answerWord.length);        //何番目を問題にするか
    this.question = answerWord[qID];

    for (int i = 0; i < 3; i++) {
      int cPos = rnd.nextInt(question.length());         //切る位置

      String firstHalf = this.question.substring(0,cPos);       //前半分
      String secondHalf = this.question.substring(cPos);        //後ろ半分
      this.question = firstHalf + "た" + secondHalf;           //たを入れる
    }
    this.question += ":このたぬきの言葉を読んで。";            //問題の文字列
    this.answer = "たを抜くと、" + answerWord[qID];            //答えの文字列
  }
  public String getHint() {
    return "落ち着いて「た」を飛ばして読もう";
  }
}