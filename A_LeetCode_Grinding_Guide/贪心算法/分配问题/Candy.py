class Candy:
    def candy(self, ratings: list) -> int:
        size=len(ratings)
        if (size<2):
            return size
        num=[1 for _ in range(size)]#初始化数组长度并且将其全部置1
        for i in range(1,size):
            if ratings[i]>ratings[i-1]:
                num[i]=num[i-1]+1
        for i in range(size-1,0,-1):
            if ratings[i]<ratings[i-1]:
                num[i-1]=max(num[i-1],num[i]+1)
        return sum(num)
result=Candy()
ratings=[1,0,2]
print(result.candy(ratings))
