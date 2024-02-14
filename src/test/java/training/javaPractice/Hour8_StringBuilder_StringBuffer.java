package training.javaPractice;

public class Hour8_StringBuilder_StringBuffer {
    //Enum helps to restrict the input data in for a variable

    public static void main(String[] args) {

        String stringObj = new String("usa");
        StringBuffer stringBufferObj = new StringBuffer("india");
        StringBuilder stringBuilderObj = new StringBuilder("dubai");

        System.out.println(System.identityHashCode(stringObj));
        stringObj = stringObj + " country";
        System.out.println(stringObj);
        System.out.println(System.identityHashCode(stringObj));
        System.out.println("------string done------");
        System.out.println(System.identityHashCode(stringBufferObj));
        stringBufferObj.append(" country");
        System.out.println(stringBufferObj);

        System.out.println(stringBufferObj.charAt(2));
        System.out.println(stringBufferObj.capacity());
        System.out.println(stringBufferObj.indexOf("count"));
        System.out.println(stringBufferObj.delete(1,3));
        System.out.println(stringBufferObj.reverse());
        System.out.println("---here----");
        System.out.println(stringBufferObj);
        System.out.println(stringBufferObj.deleteCharAt(3));
        System.out.println(stringBufferObj.replace(1,3,"HHH"));
        System.out.println(stringBufferObj.substring(1,5));
        System.out.println(stringBufferObj);

        System.out.println(System.identityHashCode(stringBufferObj));
        System.out.println("------string buffer done------");
        System.out.println(System.identityHashCode(stringBuilderObj));

        stringBuilderObj.append(" country");
        System.out.println(System.identityHashCode(stringBuilderObj));
        System.out.println("------string builder done------");
        //StringBuffer is synchronized. This means that multiple threads cannot call the methods of
        // StringBuffer simultaneously.
        //StringBuilder is asynchronized. This means that multiple threads can call the methods of
        // StringBuilder simultaneously.

        //Since there is no preliminary check for multiple threads, StringBuilder is a lot
        // faster than StringBuffer.
    }
}

