class AssignCookies:
    def findContentChildren(self, g: list, s: list) -> int:
        g.sort()#list.sort( key=None, reverse=False),reverse = True 降序， reverse = False 升序（默认）。
        s.sort()
        child,cookie=0,0
        while (child<len(g) and cookie<len(s)):
            if (g[child]<=s[cookie]):
                child+=1
            cookie+=1
        return child
result=AssignCookies()
g=[1,2,3]
s=[1,3]
print(result.findContentChildren(g,s))
