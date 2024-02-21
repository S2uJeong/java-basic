package pack;

import pack.a.User;

/**
 * 경로가 달라도 Class명이 중복이면, 중복되는 것중 하나만 import 가능하다.
 * 나머지 인스턴스는 생성 및 참조시 풀경로를 적어주어야 한다.
 */
public class PackageMain2 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
