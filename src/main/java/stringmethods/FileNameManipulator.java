package stringmethods;

public class FileNameManipulator {

    public char findLastCharacter(String str){
        return str.charAt(0);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFilename){
        return searchedFileName.equals(actualFilename);
    }

    public String changeExtensionToLowerCase(String filename){
        return filename.toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target){
        return fileName.replace(present, target);
    }

}
