# Link to the problem statement : https://leetcode.com/problems/happy-number/

class Solution:
    def isHappy(self, n: int) -> bool:
        for rep in range(20):
            sum=0
            temp=n
            while temp>0:
                digit= temp%10
                temp=int(temp/10)
                sum+=digit*digit
            n=sum  
            if sum==1:
                return True
            
        return False
        