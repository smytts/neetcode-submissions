class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for (String s : strs) {
            encodedStr.append(s.length()).append("#").append(s);
        }
        System.out.println(encodedStr.toString());
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1 + len;
            list.add(str.substring(j + 1, i));
        }
        System.out.println(list);
        return list;
    }
}
