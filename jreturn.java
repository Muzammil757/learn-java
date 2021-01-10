package Learn_Java;

class jreturn {
    String msgs[] = {
        "Output error!",
        "Input error!",
        "Disk-Full!",
        "Index Out-Of-Bounds"
    };

    String getErr(int i) {
        if(i >= 0 & i < msgs.length)
        return msgs[i];
        else
        return "Invalid Error Code!";
    }
}

class returndemo {
    public static void main(String[] args) {
        jreturn err = new jreturn();

        System.out.println(err.getErr(2));
        System.out.println(err.getErr(10));
    }
}

class Err {
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class errinfo {
    String msgs[] = {
        "Invalid output!",
        "Invalid input!",
        "Disk error!",
        "Index Out-Of-Bounds!"
    };
    int howbad[] = {3,2,2,4};

    Err geterrinfo(int i) {
        if(i >= 0 & i < msgs.length)
        return new Err(msgs[i], howbad[i]);
        else
        return new Err("Invalid Error!", 0);
    }
}

class Errinfodemo {
    public static void main(String[] args) {
       errinfo er = new errinfo();
       
       Err e;

       e = er.geterrinfo(2);
       System.out.println(e.msg + " severity " + e.severity);

       e = er.geterrinfo(10);
       System.out.println(e.msg + " severity " + e.severity);
    }
}