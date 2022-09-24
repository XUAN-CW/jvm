package learn.jdk17.jvm.equalbetweenprimitiveandwrapper;

/**
 * @author 禤成伟
 * @date 2022-09-24 - 17:19
 */
public class EqualBetweenPrimitiveAndWrapper {

    private boolean wrapperEqualsToWrapper(Integer i, Integer j){
        return i.equals(j);
    }
    private boolean wrapperEqualsToPrimitive(Integer i,int j){
        return i.equals(j);
    }

    private boolean wrapperDoubleEqualToWrapper(Integer i,Integer j){
        return i == j;
    }

    private boolean wrapperDoubleEqualToPrimitive(Integer i,int j){
        return i == j;
    }

    private boolean primitiveDoubleEqualToPrimitive(int i,int j){
        return i == j;
    }


}
