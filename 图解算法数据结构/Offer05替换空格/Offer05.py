class Offer05:
    def replaceSpace(self, s: str) -> str:
        res = []#初始化list
        for c in s:#遍历s中的每个字符c
            if c == ' ': 
                res.append("%20")#当字符为空时，往list中添加%20
            else: 
                res.append(c)#当字符不为空时，往list中添加字符c
        return "".join(res)

result=Offer05()
s = "We are happy."
print(result.replaceSpace(s))
