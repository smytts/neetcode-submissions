class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email: emails) {
            String local = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            if (local.contains("+")) local = local.substring(0, local.indexOf('+')).replace(".","");
            uniqueEmails.add(local + domain);
        }
        return uniqueEmails.size();
    }
}