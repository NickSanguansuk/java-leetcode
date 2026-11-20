package medium.solution_71;

// 71. Simplify Path

import java.util.Iterator;
import java.util.Stack;

public class Solution_71 {

    //public String simplifyPath(String path) {
    //    String result = "";
    //    Stack<String> dirNames = new Stack<>();
    //    String name = "";
    //
    //    for (int i = 1; i < path.length(); i++) {
    //        char currChar = path.charAt(i);
    //        if (currChar == '/') {
    //            if (name.length() == 0) {
    //                //continue;
    //            } else if (name.equals(".")) {
    //                name = "";
    //            } else if (name.equals("..")) {
    //                if (dirNames.size() != 0) {
    //                    dirNames.pop();
    //                }
    //                name = "";
    //            } else {
    //                dirNames.push(name);
    //                name = "";
    //            }
    //        } else {
    //            name += currChar;
    //        }
    //    }
    //
    //    if (name.equals(".")) {
    //        // Do nothing
    //    } else if (name.equals("..")) {
    //        if (dirNames.size() != 0) {
    //            dirNames.pop();
    //        }
    //    } else if (name.length() != 0) {
    //        dirNames.push(name);
    //    }
    //
    //    System.out.println("dirNames: " + dirNames);
    //
    //    if (dirNames.size() != 0) {
    //        //Iterator<String> iterator = dirNames.iterator();
    //        //while (iterator.hasNext()) {
    //        //    result = result + "/" + iterator.next();
    //        //}
    //        for (String dirName : dirNames) {
    //            result = result + "/" + dirName;
    //        }
    //    } else {
    //        result = "/";
    //    }
    //
    //    return result;
    //}

    public String simplifyPath(String path) {
        Stack<String> dirNames = new Stack<>();

        String[] splitArray = path.split("/");

        for (String item : splitArray) {
            if (item.equals(".") || item.equals("")) {
                //continue;
            } else if (item.equals("..")) {
                if (!dirNames.isEmpty()) {
                    dirNames.pop();
                }
            } else {
                dirNames.push(item);
            }
        }

        StringBuilder ans = new StringBuilder("");

        if (dirNames.isEmpty()) {
            ans.append("/");
        } else {
            for (String dirName : dirNames) {
                ans.append("/");
                ans.append(dirName);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution_71 solution = new Solution_71();

        // "/home"
        String path1 = "/home/";
        System.out.println(solution.simplifyPath(path1));

        // "/"
        String path2 = "/../";
        System.out.println(solution.simplifyPath(path2));

        // "/home/foo"
        String path3 = "/home//foo/";
        System.out.println(solution.simplifyPath(path3));

        // "/c"
        String path4 = "/a/./b/../../c/";
        System.out.println(solution.simplifyPath(path4));

        // "/a/b/c"
        String path5 = "/a/b/c/d/..";
        System.out.println(solution.simplifyPath(path5));

        // "/"
        String path6 = "/.";
        System.out.println(solution.simplifyPath(path6));

    }
}
