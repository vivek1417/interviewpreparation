/*
 * ==============================================================================
 * (c) 2019
 * Fidelity National Information Services, Inc. and/or its subsidiaries - All 
 * Rights Reserved worldwide.
 * ---------------------------------------------------------------------------
 * This document is protected under the trade secret and copyright laws as the
 * property of Fidelity National Information Services, Inc. and/or its subsidiaries.
 * Copying, reproduction or distribution should be limited and only to employees
 * with a 'need to know' to do their job. Any disclosure of this document to
 * third parties is strictly prohibited.
 * =============================================================================
 */
package com.hackerrank.repeatedstring;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class A
{
	InputStream is;

	PrintWriter out;

	String INPUT = "";

	void solve()
	{
		char[] s = ns().toCharArray();
		long n = nl();
		int m = s.length;
		int ca = 0;
		for (char c : s)
		{
			if (c == 'a') ca++;
		}
		long ret = (n / m) * ca;
		for (int i = 0; i < n % m; i++)
		{
			if (s[i] == 'a') ret++;
		}
		out.println(ret);
	}

	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty()) tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception
	{
		new A().run();
	}

	private byte[] inbuf = new byte[1024];

	private int lenbuf = 0, ptrbuf = 0;

	private int readByte()
	{
		if (lenbuf == -1) throw new InputMismatchException();
		if (ptrbuf >= lenbuf)
		{
			ptrbuf = 0;
			try
			{
				lenbuf = is.read(inbuf);
			}
			catch (IOException e)
			{
				throw new InputMismatchException();
			}
			if (lenbuf <= 0) return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c)
	{
		return !(c >= 33 && c <= 126);
	}

	private int skip()
	{
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd()
	{
		return Double.parseDouble(ns());
	}

	private char nc()
	{
		return (char) skip();
	}

	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b)))
		{ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b)))
		{
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n)
	{
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-')
		{
			minus = true;
			b = readByte();
		}

		while (true)
		{
			if (b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			}
			else
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-')
		{
			minus = true;
			b = readByte();
		}

		while (true)
		{
			if (b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			}
			else
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}
