package easy.solution_2047;

// 2047. Number of Valid Words in a Sentence

public class Solution_2047 {

    //public int countValidWords(String sentence) {
    //    int result = 0;
    //
    //    String[] words = sentence.split(" ");
    //
    //    for (int i = 0; i < words.length; i++) {
    //        String currWord = words[i];
    //        boolean isHyphen = false;
    //
    //        for (int j = 0; j < currWord.length(); j++) {
    //            char currChar = currWord.charAt(j);
    //            if (j == currWord.length() - 1) {
    //                if (currChar == ',' || currChar == '.' || currChar == '!' || (currChar >= 97 && currChar <= 122)) {
    //                    result++;
    //                }
    //            } else if (currChar >= 97 && currChar <= 122) {
    //                //continue;
    //            } else if (currChar == '-') {
    //                if (isHyphen || j == 0 || j == currWord.length() - 1) {
    //                    break;
    //                } else if (currWord.charAt(j - 1) < 97 || currWord.charAt(j - 1) > 122) {
    //                    break;
    //                } else if (currWord.charAt(j + 1) < 97 || currWord.charAt(j + 1) > 122) {
    //                    break;
    //                }
    //                isHyphen = true;
    //                //continue
    //            } else {
    //                break;
    //            }
    //        }
    //    }
    //
    //    return result;
    //}

    public int countValidWords(String sentence) {
        int ans = 0;

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];
            boolean isHyphen = false;

            for (int j = 0; j < currWord.length(); j++) {
                char currChar = currWord.charAt(j);
                if (j == currWord.length() - 1) {
                    if (currChar == ',' || currChar == '.' || currChar == '!' || (currChar >= 97 && currChar <= 122)) {
                        ans++;
                    }
                } else if (currChar >= 97 && currChar <= 122) {
                    //continue;
                } else if (currChar == '-') {
                    if (isHyphen || j == 0 || j == currWord.length() - 1) {
                        break;
                    } else if (currWord.charAt(j - 1) < 97 || currWord.charAt(j - 1) > 122) {
                        break;
                    } else if (currWord.charAt(j + 1) < 97 || currWord.charAt(j + 1) > 122) {
                        break;
                    }
                    isHyphen = true;
                    //continue
                } else {
                    break;
                }
            }
        }

        return ans;
    }

    //public int countValidWords(String sentence) {
    //    int result = 0;
    //
    //    // "\s+" is a regular expression for one or more spaces.
    //    String[] words = sentence.trim().split("\\s+");
    //
    //    for (String word : words) {
    //        if (checkWordsHelper(word)) {
    //            result++;
    //        }
    //    }
    //
    //    return result;
    //}
    //private boolean checkWordsHelper(String word) {
    //    boolean isHyphen = false;
    //
    //    for (int i = 0; i < word.length(); i++) {
    //        char currChar = word.charAt(i);
    //        if (currChar >= 97 && currChar <= 122) {
    //            //continue;
    //        } else if (currChar == '-') {
    //            if (isHyphen || i == 0 || i == word.length() - 1) {
    //                return false;
    //            } else if (word.charAt(i - 1) < 97 || word.charAt(i - 1) > 122) {
    //                return false;
    //            } else if (word.charAt(i + 1) < 97 || word.charAt(i + 1) > 122) {
    //                return false;
    //            }
    //            isHyphen = true;
    //            //continue
    //        } else if (i == word.length() - 1 && (currChar == ',' || currChar == '.' || currChar == '!')) {
    //            //continue;
    //        }  else {
    //            return false;
    //        }
    //    }
    //
    //    return true;
    //}

    public static void main(String[] args) {
        Solution_2047 solution = new Solution_2047();

        String sentence1 = "cat and  dog";
        System.out.println(solution.countValidWords(sentence1));

        String sentence2 = "!this  1-s b8d!";
        System.out.println(solution.countValidWords(sentence2));

        String sentence3 = "alice and  bob are playing stone-game10";
        System.out.println(solution.countValidWords(sentence3));

        // 50
        String sentence4 = "qte1i   1-,, yv03a  r12r2stw 4 d,tnirlsj pb !16- 9 b  dnlgrig 8   n!88qyfjly   0g f5hgfg0u9lux7 - 6ega 0p36 pnw  ae  0m  -v  q3zdw09b9qju q0! s-  jk 04 e1ik  2 3  k a1qe.ac,-w j,keef76xz8  -!zhc s b u -z. ,,b -rei 83ooj 899 af w1irv u o3jk21 71i60pq3,.rzbhc.-  t9 xlk5g  ovn 8f9  ztw 7siy p-yl856r, ma39xtl!t-o c 2x 2 drj!ms0w ysy  u0tcw8u.im c 0ke.5sk  dn8.mh qi   8xmt -bxmr  z 1r 5 umyk 8rbe!dif kmes n rp icnb s 0yc1e 8  e1 !f  .u lh  n a -iinnm!a08dfgq ,lux,j 8fyqt hcbajnb4swuxtqm4j1  ic04 o,i4lka id 0srlb  y 2k  1g  3m nptj   53rh, zim7mkd2hqf64 chotiijcemj!m dif7iiq m2e ve!9!r1 jw okyahf! r6kskaodd h eug.yc,3j ilkd 9vlpipfc  g5y   7u 5pt531!4s 4  si !lg x50-   kc51ca34s pl 9w,mgj3  5fy,.3d shi ct a k2nx8l xum9sgyp6r   rj! 8  m!1k gm  typy . oee08!!j0,2iwq  9 ywd w rhpoc s6118y c5.qw4d  tlrjs.!9 mpioexe. xmicv  ,z g2 p6 bhtm!  ,w 7 ";
        System.out.println(solution.countValidWords(sentence4));
    }
}
