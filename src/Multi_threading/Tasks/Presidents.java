package Multi_threading.Tasks;

public class Presidents {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}

class OurPresident {
    private static OurPresident president;
    static {
        synchronized(OurPresident.class) {
            president = president == null ? new OurPresident() : getOurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}