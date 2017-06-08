/**
Подается строка в виде "44/6//7 8788" и нужно переформатировать в "446-787-88" или
 строка в виде "44/6//7 878  89" и нужно переформатировать в "446-787-889"
 */

public class TransfStr {
    public static void main(String[] args) {
//        String initialValue = "01944/6//7 87asdfghjkl;881235846985dfdfg ";           //"446-787-88"
//        String initialValue = "01944/6//7 87asdfghjkl;881dfdfg ";

//        String initialValue = null;
//        String initialValue = "";
//        String initialValue = "5";
//        String initialValue = "d";
//        String initialValue = "51";
//        String initialValue = "da";
//        String initialValue = "5/1";
//        String initialValue = "555372654";
//        String initialValue = "00-44  48 5555 8361";
        String initialValue = "0 - 22 1985--324";
        String result = "";
        int i = 2;
        int j = 0;
        if (initialValue != null && initialValue.length() >= 2 && initialValue.length() <= 100) {
            char[] charAr = initialValue.toCharArray();

            for (char aCharAr : charAr) {
                if (aCharAr >= '0' && aCharAr <= '9') {
                    result = result + aCharAr;
                }
            }
            char[] charArResult = result.trim().toCharArray();

            if (result.length() % 2 == 0 && result.length() != 0) {
                result = "";
                for (int ii = 0 ; ii < charArResult.length; ii++)  {
                    result = result + charArResult[ii];
                    if (j == i  && ii < charArResult.length-1) {
                        result = result + "-";

                        if (charArResult.length-ii == 5)    {
                            i = i + 2;
                        }   else    {
                            i = i + 3;
                        }
                    }
                    j++;
                }
            }   else    {
                result = "";
                for (int ii = 0 ; ii < charArResult.length; ii++)  {
                    result = result + charArResult[ii];
                    if (j == i && ii < charArResult.length-1) {
                        result = result + "-";
                        i = i + 3;
                    }
                    j++;
                }

            }
        }
        System.out.println(result);
    }
}
