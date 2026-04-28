import java.util.Arrays;

class SqueakyClean {
    static String clean(String identifier) {
        char[] chars = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            switch (chars[i]){

                case ' ':
                    builder.append('_');
                    break;
                case '-':
                    i++;
                    if(i < chars.length) builder.append(Character.toUpperCase(chars[i]));
                    break;
                case '4':
                    builder.append('a');
                    break;
                case '3':
                    builder.append('e');
                    break;
                case '0':
                    builder.append('o');
                    break;
                case '1':
                    builder.append('l');
                    break;
                case '7':
                    builder.append('t');
                    break;

                default:
                    if(Character.isAlphabetic(chars[i])){
                        builder.append(chars[i]);
                        break;
                    }
                    break;

            }
        }
        return builder.toString();

    }
}
