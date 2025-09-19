package FileUpload;

import Base.BaseTests;
import Pages.FileUploadPage;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage fileUploaded = homePage.clickFileUpload();
        fileUploaded.uploadFile("C:\\Users\\Vina\\Downloads\\Upload.txt");


        assertEquals(fileUploaded.getUploadedMessage(), "Upload.txt");
    }
}
