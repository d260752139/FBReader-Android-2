/*
 * Copyright (C) 2009-2012 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.plugin.base.tree;

import java.io.Serializable;

import org.geometerplus.zlibrary.core.tree.ZLTree;

public class TOCTree extends ZLTree<TOCTree> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7039615644378181025L;
	private String myText;
	private Reference myReference;

	protected TOCTree() {
		super();
	}

	public TOCTree(TOCTree parent) {
		super(parent);
	}

	public final String getText() {
		return myText;
	}

	public final void setText(String text) {
		if (text != null) {
			myText = text.trim().replaceAll("[\t ]+", " ");
		} else {
			myText = null;
		}
	}

	public Reference getReference() {
		return myReference;
	}

	public void setReference(int reference) {
		myReference = new Reference(reference);
	}

	public static class Reference implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5325145061002706496L;
		public final int PageNum;

		public Reference(final int pageNum) {
			PageNum = pageNum;
		}
	}
}
