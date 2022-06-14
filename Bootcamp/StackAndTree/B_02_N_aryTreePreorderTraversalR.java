package Bootcamp.StackAndTree;

import java.util.ArrayList;
import java.util.List;

public class B_02_N_aryTreePreorderTraversalR {
    class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public static void main(String[] args) {

    }
    public static List<Integer> preorder(Node root) {
        List<Integer>list=new ArrayList<>();
        pre(root,list);
        return list;
    }
    public static void pre(Node root,List<Integer>list) {
        if(root==null)return;

        list.add(root.val);
        for(Node node:root.children){
            pre(node,list);
        }
    }
}
