class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        k = s.split();
        return ' '.join(reversed(k))
        