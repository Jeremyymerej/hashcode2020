package hashcode2020.Parser

class FileReader {

    static String readFile(String path) {
        return new File(path).text
    }
}
