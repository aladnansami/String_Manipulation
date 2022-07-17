/*7. Find out how many images are in the given array:
        ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
        Output: 3*/

package String_Manipulation;

public class how_many_images {
    public static void main(String[] args) {
        String[] photo = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        int count = 0;

        for( String output : photo){
            if(output.contains(".jpg")  || output.contains(".png") || output.contains(".jpeg") ){
                count += 1;
            }
        }
        System.out.println("Total photo: " + count);
    }
}
