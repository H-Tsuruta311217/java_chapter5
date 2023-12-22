// abstract class Quiz {         //抽象クラス
//   //この抽象クラスを継承した子クラスは
//   //以下のフィールドやメソッドを持っていることを保証します。
//   String question;        //問題を保存するフィールド
//   String answer;          //答えを保zんするフィールド

//   abstract void createQuestion();      //問題を作るメソッドは必ず書き換えが必要

//   String getQuestion() {         //その問題を教えてくれる
//     return this.question;
//   }
//   String getAnswer() {          //その答えを教えてくれる
//     return this.answer;
//   }
// }

abstract class Quiz implements HintAdviser {         //インターフェイスを追加
  //この抽象クラスを継承した子クラスは
  //以下のフィールドやメソッドを持っていることを保証します。
  String question;        //問題を保存するフィールド
  String answer;          //答えを保zんするフィールド

  abstract void createQuestion();      //問題を作るメソッドは必ず書き換えが必要

  String getQuestion() {         //その問題を教えてくれる
    return this.question;
  }
  String getAnswer() {          //その答えを教えてくれる
    return this.answer;
  }
}