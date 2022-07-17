/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456*/

package String_Manipulation;

public class Extract_the_transaction_ID {
    public static void main(String[] args) {
        String htmlvalue = "<html> + ' ' + <title> + ' ' + Test + ' ' + </title> + ' ' + <body> + ' ' + Your trnx is successful. + ' ' + Trnx Id is: TXN123456 + ' ' + </body> + ' ' + </html>";

        int find = htmlvalue.indexOf("TXN123456");
        System.out.println(htmlvalue.substring(find,130));
    }
}
