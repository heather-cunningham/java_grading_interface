//Heather Cunningham and Bryanna O'Brien 10/26/16 Adv Java Fall '16
public interface Grading
//****NOTE: Make all of these arrays of ints per JBS 10/31/16
{
//Java doc comments
/**
Mean accepts array of ints and returns simple average of all values.
*/
   int mean(int[] arrPassed);

/**
Median accepts array of ints, which must be sorted first,
and returns the value directly in the middle (the midpoint) -- 
the value with as many values above the median as below, 
accounting for lists with an even number of elements when needed.
*/
   int median(int[] arrPassed);

/**
Mode accepts an array of ints, which can be sorted first for ease of use,
and returns the value that occurrs the most frequently.
Return an array of all the modes.  
If uniform or has no mode, just return the entire array with no dupes.
*/
//If desired, can it rtn a 2d arry w/ modes and freq?   
   int[] mode(int[] arrPassed);

/*
Is never called in the Demo, so doesn't matter   
//toString for mode
   String modeToString(int[] modeArrPassed);
*/   
}//end class interface 