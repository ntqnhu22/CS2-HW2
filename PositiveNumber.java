public class PositiveNumber {
    private int value;
    public PositiveNumber( int value){
        if (value<0){
            this.value=0;
        }else{
            this.value=value;
        }
        //this.value=value;  the issue is we don't know it's positive or not
    }
    public PositiveNumber add (PositiveNumber other){ //other is b, a is value/ add method of a
        int newValue= value + other.value; // value+other.getValue()
        PositiveNumber newNumber= new PositiveNumber(newValue);
       // return new PositiveNumber(newValue);
       return newNumber;
    }
    //public static: not type to the class anymore
    
    public int getValue(){
        return value;
    }
    
}
