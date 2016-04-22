Hit&Blowで入力された値を並び替えて表示する機能をつける

<例>
import java.util.Comparator;

public class PersonComparator implements ()

Comparable
Comparator
の2種類の方法がある。
とりあえずはHistoryの機能を実装する。
並び替え自体は自分で実装せずに既存のクラスを使うこと

課題1：Comparableを使って行うこと
Hit数が多いのを先に、次にBlow数が多いのを先に表示させる

課題2：Comparatorを使って行うこと
課題1と同じ
ほか、いろいろなComparatorを作って、いろいろな並び替えをする。

Comparatorは、並び替えさせたい外の人が指定したほうが良い
History.sortedResult(new MyComparator());
