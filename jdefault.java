package Learn_Java;
//in interface the private meth can only be access through default or any other private meth
//it couldn't be accessible outside the code(interface)
interface myinfo {
    int getuserid();
    default double getadminid() {
        return 12.1;
    }
}

class info implements myinfo {
    public int getuserid() {
        return 2;
    }
}

class defaultdemo {
    public static void main(String[] args) {
        info ob = new info();

        System.out.println("User ID is " + ob.getuserid());

        System.out.println("Administrator ID is " + ob.getadminid());
        //due to default meth there's no need to re-type and set admin ID because due to default we set it first
        //we can also reset the default meth in class info as we did it for user-ID
    }
}

interface myinfo1 {
    int getuserid();
    default double getadminid() {
        return 12.1;
    }
    static int getuniversalid() {
        return 0;
    }
}

class info1 implements myinfo {
    public int getuserid() {
        return 2;
    }
}

class defaultstaticdemo {
    public static void main(String[] args) {
        info1 ob = new info1();

        System.out.println("User ID is " + ob.getuserid());

        System.out.println("Administrator ID is " + ob.getadminid());
        
        System.out.println("Universal ID is " + myinfo1.getuniversalid());
    }
}