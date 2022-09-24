package learn.jdk17.jvm.equalbetweenprimitiveandwrapper;

/**
 * @author 禤成伟
 * @date 2022-09-24 - 17:44
 */
public class PromoteByUsePrimitive {
    public static void main(String[] args) {

        System.out.println(sumByPrimitive());
        System.out.println(sumByWrapper());
    }



    private static long sumByPrimitive(){
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long sumByWrapper(){
        long start = System.currentTimeMillis();
        Long sum = Long.valueOf(0L);
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
