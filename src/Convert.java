class Convert {
    static Integer convertRomanianToArabian(String stringRome) {
        int number = 0;
        char arr[] = stringRome.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            //1000
            if (arr[i] == 'M')
                number = number + 1000;

            //500
            if (arr[i] == 'D')
                number = number + 500;

            //100
            if (arr[i] == 'C') {
                if (i == arr.length - 1) {
                    number = number + 100;
                } else {
                    if ((arr[i + 1] == 'D' || arr[i + 1] == 'M')) {
                        number = number - 100;
                    } else
                        number = number + 100;
                }
            }

            if (arr[i] == 'L')
                number = number + 50;

            //10
            if (arr[i] == 'X') {
                if (i == arr.length - 1) {
                    number = number + 10;
                }
                else {
                    if ((arr[i + 1] == 'C' || arr[i + 1] == 'L')) {
                        number = number - 10;
                    }
                    else
                        number = number + 10;
                }
            }

            //5
            if (arr[i] == 'V') {
                number = number + 5;
            }

            //1
            if (arr[i] == 'I') {
                if (i == arr.length - 1) {
                    number = number + 1;
                }
                else {
                    if ((arr[i + 1] == 'V' || arr[i + 1] == 'X')) {
                        number = number - 1;}
                    else
                        number = number + 1;
                }
            }
        }
        return number;
    }

    static String convertArabianToRomanian (String stringArab) {
        Integer number = Integer.parseInt(stringArab);

        int m = 0, cm = 0, dccc = 0, dcc = 0, dc = 0, d = 0, ccc = 0, cc = 0, c = 0, cd = 0,
                xc = 0, lxxx = 0, lxx = 0, lx = 0, xl = 0, xxx = 0, xx = 0, ix = 0,
                viii = 0, vii = 0, vi = 0, iv = 0, iii = 0, ii = 0,
                l = 0, x = 0, v = 0, i = 0;
        String romanianNumber = "";

        //1000
        m = number / 1000;
        number = number - m * 1000;

        //900
        cm = number / 900;
        number = number - cm * 900;

        //800
        dccc = number / 800;
        number = number - dccc * 800;

        //700
        dcc = number / 700;
        number = number - dcc * 700;

        //600
        dc = number / 600;
        number = number - dc * 600;

        //500
        d = number / 500;
        number = number - d * 500;

        //400
        cd = number / 400;
        number = number - cd * 400;

        //300
        ccc = number / 300;
        number = number - ccc * 300;

        //200
        cc = number / 200;
        number = number - cc * 200;

        //100
        c = number / 100;
        number = number - c * 100;

        //90
        xc = number / 90;
        number = number - xc * 90;

        //80
        lxxx = number / 80;
        number = number - lxxx * 80;

        //70
        lxx = number / 70;
        number = number - lxx * 70;

        //60
        lx = number / 60;
        number = number - lx * 60;

        //50
        l = number / 50;
        number = number - l * 50;

        //40
        xl = number / 40;
        number = number - xl * 40;

        //30
        xxx = number / 30;
        number = number - xxx * 30;

        //20
        xx = number / 20;
        number = number - xx * 20;

        //10
        x = number / 10;
        number = number - x * 10;

        //9
        ix = number / 9;
        number = number - ix * 9;

        //8
        viii = number / 8;
        number = number - viii * 8;

        //7
        vii = number / 7;
        number = number - vii * 7;

        //6
        vi = number / 6;
        number = number - vi * 6;

        //5
        v = number / 5;
        number = number - v * 5;

        //4
        iv = number / 4;
        number = number - iv * 4;

        //3
        iii = number / 3;
        number = number - iii * 3;

        //2
        ii = number / 2;
        number = number - ii * 2;

        //1
        i = number / 1;
        number = number - i * 1;

        //1000
        for (int j = 0; j < m; j++) {
            romanianNumber = romanianNumber + "M";
        }
        //900
        for (int j = 0; j < cm; j++) {
            romanianNumber = romanianNumber + "CM";
        }
        //800
        for (int j = 0; j < dccc; j++) {
            romanianNumber = romanianNumber + "DCCC";
        }
        //700
        for (int j = 0; j < dcc; j++) {
            romanianNumber = romanianNumber + "DCC";
        }
        //600
        for (int j = 0; j < dc; j++) {
            romanianNumber = romanianNumber + "DC";
        }
        //500
        for (int j = 0; j < d; j++) {
            romanianNumber = romanianNumber + "D";
        }
        //400
        for (int j = 0; j < cd; j++) {
            romanianNumber = romanianNumber + "CD";
        }
        //300
        for (int j = 0; j < ccc; j++) {
            romanianNumber = romanianNumber + "CCC";
        }
        //200
        for (int j = 0; j < cc; j++) {
            romanianNumber = romanianNumber + "CC";
        }

        //100
        for (int j = 0; j < c; j++) {
            romanianNumber = romanianNumber + "C";
        }

        //90
        for (int j = 0; j < xc; j++) {
            romanianNumber = romanianNumber + "XC";
        }

        //80
        for (int j = 0; j < lxxx; j++) {
            romanianNumber = romanianNumber + "LXXX";
        }

        //70
        for (int j = 0; j < lxx; j++) {
            romanianNumber = romanianNumber + "LXX";
        }

        //60
        for (int j = 0; j < lx; j++) {
            romanianNumber = romanianNumber + "LX";
        }

        //50
        for (int j = 0; j < l; j++) {
            romanianNumber = romanianNumber + "L";
        }

        //40
        for (int j = 0; j < xl; j++) {
            romanianNumber = romanianNumber + "XL";
        }

        //30
        for (int j = 0; j < xxx; j++) {
            romanianNumber = romanianNumber + "XXX";
        }

        //20
        for (int j = 0; j < xx; j++) {
            romanianNumber = romanianNumber + "XX";
        }

        //10
        for (int j = 0; j < x; j++) {
            romanianNumber = romanianNumber + "X";
        }

        //9
        for (int j = 0; j < ix; j++) {
            romanianNumber = romanianNumber + "IX";
        }

        //8
        for (int j = 0; j < viii; j++) {
            romanianNumber = romanianNumber + "VIII";
        }

        //7
        for (int j = 0; j < vii; j++) {
            romanianNumber = romanianNumber + "VII";
        }

        //6
        for (int j = 0; j < vi; j++) {
            romanianNumber = romanianNumber + "VI";
        }

        //5
        for (int j = 0; j < v; j++) {
            romanianNumber = romanianNumber + "V";
        }

        //4
        for (int j = 0; j < iv; j++) {
            romanianNumber = romanianNumber + "IV";
        }

        //3
        for (int j = 0; j < iii; j++) {
            romanianNumber = romanianNumber + "III";
        }

        //2
        for (int j = 0; j < ii; j++) {
            romanianNumber = romanianNumber + "II";
        }

        //1
        for (int j = 0; j < i; j++) {
            romanianNumber = romanianNumber + "I";
        }

        return romanianNumber;
    }

    static void testConvert() throws InterruptedException {
        System.out.println("Тест корвертируемых чисел, из арабских в римские и обратно в арабские, от 1 до 100");

        for(Integer i = 1; i <= 1000; i++) {
            String number = i.toString();
            String romanianNumber = Convert.convertArabianToRomanian(number);
            Integer arabianNumber = Convert.convertRomanianToArabian(romanianNumber);
            boolean status = i.equals(arabianNumber) ? true: false;
            if(!status)
                System.out.println(i + " " + romanianNumber + " " + arabianNumber + "   " + status);
            Thread.sleep(10);
        }
    }
}
