package Annotation;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class AnnotationCourse {
    /**
     * 使用Annotation时 要再其前面加@，并把Annotation当作一个修饰符来使用
     *  1. @Override:限定某个方法，是重写父类方法，该注解只用于方法（用于语法的校验）
     *  2. @Deprecated：用于表示某个程序元素（类，方法等）已过时[过时也能用，但是仍然能够使用，只是不推荐使用，可以修饰方法，类，字段，包]作用：兼容过度
     *  3. @SuppressWarnings:一直编译器警告
     *      1.当我们不希望看到那些黄色警告信息的时候可以使用
     *      2.作用范围和你写的位置相关
     *      3.语法：@SuppressWarnings({""})
     *  4.修饰注解的注解我们称为元注解（@Target,）
     * */
}
