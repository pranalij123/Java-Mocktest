public class TestDeiver {
    static{
        System.out.println("from static block 1");
    }

    {
        System.out.println("from non static block 1");
    }
    public static void main(String[] args) {
        System.out.println("main() start");
        new TestDeiver();
        System.out.println("main() end");
    }

    static{
        System.out.println("from static block 2");
    }

    {
        System.out.println("from non static block 2");
    }
}
/*output:
 from static block 1
from static block 2
main() start
from non static block 1
from non static block 2
main() end

 */
