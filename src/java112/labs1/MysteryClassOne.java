package java112.labs1;

/**
 * Mystery Class Lab: our first TDD of the semester,.
 * @author iaoverman
 */
public class MysteryClassOne {
    /**
     * runs MysteryClassOne outputting value from mysteryMethodOne
     * @param args [description]
     */
    public static void main(String[] args) {
        MysteryClassOne demo = new MysteryClassOne();
        System.out.println("The value is: " + demo.mysteryMethodOne());

    }

    /**
     * mysteryMethodOne
     * @return number number
     */
    public int mysteryMethodOne() {
        return 1;
    }
}
