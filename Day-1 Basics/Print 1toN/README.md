# 📘 Print Numbers from 1 to N using Recursion (Java)

This Java program demonstrates how to print numbers from 1 to N using recursion.  
It’s a classic example to understand *head recursion* and *base case handling*.

---

## ✅ Output Example

For N = 5, the output will be:
1
2
3
4
5
---

## 🧠 How It Works

The idea is to:
1. First *recursively call* the function with n-1
2. Then *print* the number after returning from the recursive call

This ensures numbers are printed in *ascending order* during the return phase of the recursion.

---

## 🧩 Recursion Flow Diagram (for N = 3)

printAscending(3)
└── printAscending(2)
└── printAscending(1)
└── printAscending(0) → base case
← print 1
← print 2
← print 3
