import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> partyList = new ArrayList<>();

        partyList.add("ピカチュウ");
        partyList.add("エーフィ");
        partyList.add("カビゴン");
        partyList.add("フシギバナ");
        partyList.add("カメックス");
        partyList.add("リザードン");

        System.out.println("レッドの手持ちは" + partyList.size() + "匹");
        System.out.println("先頭から------");

        for (String value : partyList) {      //手持ちの表示
            System.out.println(value);
        }

        System.out.println("-------------");

        System.out.println(partyList.get(0) + "戦闘不能");
        partyList.remove(0);

        System.out.println("レッドは" + partyList.get(4) + "を繰り出した");

        System.out.println("レッドはげんきのかけらを使った");
        partyList.add("ピカチュウ");
        System.out.println(partyList.get(5) + "元気を取り戻した");

        System.out.println(partyList.get(4) + "戦闘不能");
        partyList.remove(4);

        System.out.println("レッドの残りの手持ちは" + partyList.size() + "匹だ");
        System.out.println("先頭から------");

        for (String value : partyList) {      //手持ちの表示
            System.out.println(value);
        }

        System.out.println("-------------");

        System.out.println("レッドは繰り出すポケモンを選んでいる");

        try {           //例外処理
            System.out.println("レッドは" + partyList.get(5) + "を繰り出そうとしている");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("選択できません");

        }finally {
            System.out.println("選択が終わりました");
        }

        System.out.println("レッドは" + partyList.get(1) + "を繰り出した");

    }

}

