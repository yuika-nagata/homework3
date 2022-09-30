import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<String> party = new ArrayList<>();

        party.add("ピカチュウ");
        party.add("エーフィ");
        party.add("カビゴン");
        party.add("フシギバナ");
        party.add("カメックス");
        party.add("リザードン");

        System.out.println("レッドの手持ちは" + party.size() + "匹");
        System.out.println("先頭から------");

        for (String pokemon : party) {      //手持ちの表示
            System.out.println(pokemon);
        }

        System.out.println("-------------");

        System.out.println(party.get(0) + "戦闘不能");
        party.remove(0);

        System.out.println("レッドは" + party.get(4) + "を繰り出した");

        System.out.println("レッドはげんきのかけらを使った");
        party.add("ピカチュウ");
        System.out.println(party.get(5) + "元気を取り戻した");

        System.out.println(party.get(4) + "戦闘不能");
        party.remove(4);

        System.out.println("レッドの残りの手持ちは" + party.size() + "匹だ");
        System.out.println("先頭から------");

        for (String pokemon : party) {      //手持ちの表示
            System.out.println(pokemon);
        }

        System.out.println("-------------");

        System.out.println("レッドは繰り出すポケモンを選んでいる");

        try {           //例外処理
            System.out.println("レッドは" + party.get(5) + "を繰り出そうとしている");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("選択できません");

        }finally {
            System.out.println("選択が終わりました");
        }

        System.out.println("レッドは" + party.get(1) + "を繰り出した");

    }

}

