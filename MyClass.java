// class MyClass {      //自分の名前を言ってあいさつするクラス
//   String myName = "";
//   void hello() {
//     System.out.println(myName + "です。こんにちは。");
//   }
// }

// class MyClass {      //自分の名前を言ってあいさつするクラス
//   private String myName = "";
//   public void hello() {
//     System.out.println(myName + "です。こんにちは。");
//   }
//   public void setMyName(String name) {
//     if (myName == "") {
//       myName = name;
//     }
//   }
// }

class MyClass {      //自分の名前を言ってあいさつするクラス
  private String myName = "";     //最初はからっぽにしておく
  public void hello() {
    System.out.println(myName + "です。こんにちは。");
  }
  public void setMyName(String name) {
    if (myName == "") {      //名前が空っぽのときは命名できる
      myName = name;
    }
  }
  public void renameMyName(String name) {
    if (myName != "") {
      myName = name;
    }
  }
}