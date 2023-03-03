package HomeWork08;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public enum Color implements GetColor{
    RED(255,0,0),BLUE(0,0,255),YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public void show() {
        System.out.println(name()+":");
        System.out.print("RedValue:"+getRedValue()+"\t");
        System.out.print("BlueValue:"+getBlueValue()+"\t");
        System.out.print("GreenValue:"+getGreenValue());
    }
    public static void f1(Color color){
        switch (color){
            case RED:
               RED.show();
                System.out.println();
                break;
            case BLUE:
                BLUE.show();
                System.out.println();
                break;
            case GREEN:
                GREEN.show();
                System.out.println();
                break;
            case YELLOW:
                YELLOW.show();
                System.out.println();
                break;
            default:
                break;

    }
}
}
