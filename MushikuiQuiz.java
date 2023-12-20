import java.util.Random;
class MushikuiQuiz extends CalcQuiz{     //虫食いクイズを作るクラスタ
  MushikuiQuiz () {       //コンストラクタ
    createQuestion();
  }
  void createQuestion() {       //問題を１つ作る
    Random rnd = new Random();
    int dan = rnd.nextInt(10);      //何の段か
    int qID = rnd.nextInt(10);      //見せない番号
    this.question = "";             //問題文変数

    for(int i = 0; i < 10; i++) {
      if (i == qID) {        //見せない時
        this.question += "[○]";
      } else {              //見せる時
        this.question += "[" + (dan * i) + "]";
      }
    }
    this.question += ":○に入る数は何でしょう？";        //問題の文字列
    this.answer = "答え：" + (dan * qID);               //答えの文字列
  }
}

