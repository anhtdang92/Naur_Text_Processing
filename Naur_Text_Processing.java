// Naur Text Processing Assignment
// CS 3321 Software Engineering
// Group Members: Anh Dang, Gilchrist Souabedet

public class Naur_Text_Processing {

    public static void main(String[] args) {

        int maxpos = 30;

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Pellentesque adipiscing commodo elit at. Venenatis tellus in metus vulputate. Ut tristique et egestas quis ipsum. Egestas";

        String[] str_arr;
        str_arr = new String[(text.length() / 30) * 2];

        int y = text.indexOf(' ');
        int[] space_pos_arr;

        space_pos_arr = new int[text.length()];
        int n = 0;
        for (int x = y; x < text.length(); x++) {

            space_pos_arr[n] = y;

            n++;
            y = text.indexOf(' ', y + 1);
            if (y < 0) {
                break;
            }
        }

        int temp = 0;
        int z = 0;
        int i = 0;
        int j = 0;

        int[] space_pos;
        space_pos = new int[100];

        for (int x = 0; x <= n; x++) {

            i = maxpos + z;

            if (i >= text.length()) {
                break;
            }

            while (space_pos_arr[x] < maxpos + z) {
                temp = space_pos_arr[x];
                x++;
            }

            z = temp;

            space_pos[j] = temp;
            j++;
        }

        String[] str_arr_final;
        str_arr_final = new String[j];

        int b = 0;

        for (int x = 0; x < j; x++) {
            str_arr_final[x] = text.substring(b, space_pos[x]);
            b = space_pos[x] + 1;
        }
        System.out.println("Lorem text: " + text);

        System.out.println();

        for (int x = 0; x < j; x++) {
            System.out.println("Line " + (x + 1) + ": " + str_arr_final[x]);

        }
    }

}
