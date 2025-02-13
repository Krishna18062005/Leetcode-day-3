class Solution:
    def getSecondLargest(self,lst):
        
        if (len(lst)<2):
            return none
        
        one = max(lst[0] , lst[1])
        second = min(lst[0] , lst[1])
        
        for i in range(2,len(lst)):
            if (lst[i] > one):
                second = one
                one = lst[i]
            elif(second < lst[i] < one):
                second = lst[i]
        
        if (one == second):
            return -1
            
        return second