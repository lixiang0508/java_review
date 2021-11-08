package review.enumerateclass;

/**
 * @author zlx
 * @create 2021-08-28 2:57 下午
 */
public class EnumTest {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer);
        Season[]    values=Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
    }
}
interface info {
  void  show()   ;
}
enum Season implements info{
   SPRING("春天","春暖花开"){
       @Override
       public void show() {
           System.out.println("this is spring!");
       }
   },
   SUMMER("夏天","夏日炎炎") {
       @Override
       public void show() {
           System.out.println("this is summer!");
       }
   },

    AUTUMN("秋天","秋高气爽") ;


    private final String seasonName;//属性都用private final修饰
    private final String seasonDesc;

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public void show() {
        System.out.println("this is season");
    }
}
