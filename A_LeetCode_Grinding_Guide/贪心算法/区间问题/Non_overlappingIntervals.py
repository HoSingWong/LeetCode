class Non_overlappingIntervals:
    def eraseOverlapIntervals(self, intervals: list) -> int:
        if not intervals:
            return 0
        n=len(intervals)
        intervals = sorted(intervals, key=lambda b:b[1])#按照数组中的[[a,b]]的b位从小到大排序
        total,prev=0,intervals[0][1]
        for i in range(1,n):
            if (intervals[i][0]<prev):
                total+=1
            else:
                prev=intervals[i][1]
        return total

result=Non_overlappingIntervals()
intervals=[[1,2]]
print(result.eraseOverlapIntervals(intervals))
